package com.kaishengit.controller;

import com.kaishengit.exception.NotFoundException;
import com.kaishengit.pojo.User;
import com.kaishengit.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

/**
 * Created by Administrator on 2017/5/20.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;



    /**
     * 显示所有账号
     * @param model
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String findAll(Model model) {
        List<User> userList = userService.findAll();
        model.addAttribute("userList", userList);
        return "user/list";
    }



    /**
     * 添加账户
     * get()方法
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String save() {
        return "user/add";
    }

    /**
     * 添加后保存账户
     * @param user
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String saveNew(User user, RedirectAttributes redirectAttributes) {
        userService.save(user);
        redirectAttributes.addFlashAttribute("message", "保存成功");
        return "redirect:/user";
    }


    /**
     * 修改账号
     * get()方法
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}/edit", method = RequestMethod.GET)
    public String editUser(@PathVariable Integer id, Model model) {
        User user = userService.findById(id);
       /* model.addAttribute("user", user);
        return "user/edit";*/
        if (user != null) {
            model.addAttribute("user", user);
            return "user/edit";
        } else {
            throw new NotFoundException();
        }
    }

    /**
     * 修改后保存
     * @param user
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}/edit", method = RequestMethod.POST)
    public String editUser(User user, RedirectAttributes redirectAttributes) {
        userService.update(user);
        redirectAttributes.addFlashAttribute("message", "完成更新");
        return "redirect:/user";
    }


    /**
     * 删除账号
     * @param id
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/{id:\\d+}/del", method = RequestMethod.GET)
    public String delUser(@PathVariable Integer id, RedirectAttributes redirectAttributes) {

        userService.del(id);
        redirectAttributes.addFlashAttribute("message", "删除成功");
        return "redirect:/user";

    }


}

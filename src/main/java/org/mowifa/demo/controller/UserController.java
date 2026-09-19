package org.mowifa.demo.controller;
import org.mowifa.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    @PostMapping
    public String save(@RequestBody User user) {
        return "新建用户成功";
    }

    /**
     * 查找所有用户
     *
     * @return
     */
    @GetMapping
    public String getAll() {
        return "查找所有用户成功";
    }

    /**
     * 查找单个用户
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public String getOne(@PathVariable Long id) {
        return "查找本用户成功";
    }

    /**
     * 修改用户
     */
    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody User user) {
        return "修改成功";
    }

    /**
     * 删除用户
     */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return "删除用户成功";
    }
}

package com.zhujiacheng.test;


import com.zhujiacheng.pojo.User;
import com.zhujiacheng.service.IUserService;
import com.zhujiacheng.utils.ExcelUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {

    @Resource
    private IUserService iUserService;


    @Test
    public void getList(){

        List<Object> list = new ArrayList<>();

       getSon(1,list);

       Map map = new HashMap();

       map.put(1,"我爱你");

       map.toString();

       StringBuffer parentBuffer = new StringBuffer();

        list.forEach(user->{

        parentBuffer.append(user);

        });

        System.out.println(parentBuffer);

    }

    private void getSon(Integer pid, List<Object> list){

        List<User> parent = iUserService.getParent(pid);

        /*List<Object> list = new ArrayList<>();*/

        parent.forEach(user -> {

            if(user.getPid()==null){

            return;

            }else{

                list.add(user);

                getSon(user.getId(),list);

                User user1 = iUserService.getById(user.getId());

                
            }

        });

    }


    @Test
    public void excel2Pojo() throws Exception {
        //指定输入文件
        FileInputStream fis = new FileInputStream("D:/1.xls");
        //指定每列对应的类属性
        LinkedHashMap<String, String> alias = new LinkedHashMap<>();
        alias.put("姓名","name");
        alias.put("年龄","age");
        //转换成指定类型的对象数组
        List<User> pojoList = ExcelUtil.excel2Pojo(fis, User.class, alias);

        pojoList.forEach(user -> {

            user.setId(1);
            iUserService.save(user);

        });

    }


}

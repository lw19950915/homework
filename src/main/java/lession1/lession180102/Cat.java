/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:lession1.lession180102
 * Date:2018年1月2日下午5:16:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package lession1.lession180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午2:28:15 <br/>
 * 
 * @author lvwei
 * @version
 * @see
 */
public class Cat extends Pet {
    public Cat(String name, String foot) {
        setName(name);
        setFoot(foot);
    }

    public void eat() {
        System.out.println(this.getName() + "吃" + this.getFoot());
    }
}

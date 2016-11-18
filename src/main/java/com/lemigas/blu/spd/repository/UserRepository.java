/**
 * Innovez-One, Proprietary Software Cloud Communications
 *  Copyright (c) 2015, Innovez-One and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from Innovez-One.
 *
 *  Website : http://www.innovez-one.com/
 *  Report bugs to <techsupport@innovez-one.com>.
 *  Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.lemigas.blu.spd.repository;

import com.lemigas.blu.spd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author andry on 07/06/16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}

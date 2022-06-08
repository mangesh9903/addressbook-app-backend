package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/*********************************************************************
 * Purpose: Interface for Addressbook Repository.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 08-06-2022
 *
 **********************************************************************/
@Repository
public interface AddressbookRepository extends JpaRepository<AddressbookData, Integer> {
}

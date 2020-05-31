package com.example.membertest.inquiry;

import com.example.membertest.inquiry.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InquiryRepository extends JpaRepository<Inquiry, Integer>{
}
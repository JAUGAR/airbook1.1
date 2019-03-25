package com.airbook.airbook.modules.web;


import com.airbook.airbook.modules.dao.booklistdao;
import com.airbook.airbook.modules.entity.booklist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class booklistservice {
    @Autowired
    private booklistdao booklistdao;
    private booklist booklist= new booklist();

    public void setbooklist(@PathVariable("id") int id,
                            String username,
                            String usercity,
                            String usex,
                            String anum,
                            String aplace,
                            String atime,
                            String acompany)

    {
        booklist.setId(id);
        booklist.setUsername(username);
        booklist.setUsercity(usercity);
        booklist.setUsex(usex);
        booklist.setAnum(anum);
        booklist.setAplace(aplace);
        booklist.setAtime(atime);
        booklist.setAcompany(acompany);

        booklistdao.saveAndFlush(booklist);//jpa语句
    }

    public List<booklist> findbyusername(String username){
        return booklistdao.findAllByUsername(username);
    }
}

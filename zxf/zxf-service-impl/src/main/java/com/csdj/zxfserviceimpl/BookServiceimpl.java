package com.csdj.zxfserviceimpl;

import com.csdj.pojo.BookInfo;
import com.csdj.service.BookService;
import com.csdj.zxfdao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceimpl implements BookService {
    @Autowired
    BookMapper mapper;

    @Override
    public List<BookInfo> getBook() {
        return mapper.selectAll();
    }
}

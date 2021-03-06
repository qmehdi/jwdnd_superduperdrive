package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FileMapper {
    /**
     * Returns a single file for the logged-in user
     * @param filename
     * @param userid
     * @return
     */
    @Select("SELECT * FROM FILES WHERE filename = #{filename} and userid = #{userid}")
    File getFile(String filename, Integer userid);

    /** Returns
     * list of files for the logged-in user
     * @param userid
     * @return
     */
    @Select("SELECT * FROM FILES WHERE userid = #{userid}")
    List<File> getAllFiles(Integer userid);

    /**
     * Deletes a given file
     * @param fileid
     * @param userid
     * @return
     */
    @Select("DELETE FROM FILES WHERE fileid = #{fileid} and userid = #{userid}")
    File deleteFile(Integer fileid, Integer userid);

    /**
     * Insert a file
     * @param file
     * @return
     */
    @Insert("INSERT INTO FILES (fileId, filename, contenttype, filesize, userid, filedata, uploadedtime) VALUES(#{fileId}, #{filename}, #{contenttype}, #{filesize}, #{userid}, #{filedata}, #{uploadedtime})")
    @Options(useGeneratedKeys = true, keyProperty = "fileId")
    int insertFile(File file);
}

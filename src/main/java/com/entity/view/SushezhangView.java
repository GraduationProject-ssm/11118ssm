package com.entity.view;

import com.entity.SushezhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍长
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-24 15:20:21
 */
@TableName("sushezhang")
public class SushezhangView  extends SushezhangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushezhangView(){
	}
 
 	public SushezhangView(SushezhangEntity sushezhangEntity){
 	try {
			BeanUtils.copyProperties(this, sushezhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

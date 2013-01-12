package com.fexco.util.lang;

import java.util.List;

import com.fexco.util.lang.model.GroupElement;

/**
 * Walks through model and transforms it to string
 */
public interface IGroupWalker {

	/**
	 * Gets string for a model
	 * 
	 * @param groups
	 * @return string representation of model
	 */
	String getString(List<GroupElement> groups);
}

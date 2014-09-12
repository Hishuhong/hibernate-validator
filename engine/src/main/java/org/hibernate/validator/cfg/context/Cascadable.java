/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hibernate.validator.cfg.context;

/**
 * Facet of a constraint mapping creational context which allows to mark the underlying
 * element as to be validated in a cascaded way.
 *
 * @author Gunnar Morling
 * @author Kevin Pollet &lt;kevin.pollet@serli.com&gt; (C) 2011 SERLI
 */
public interface Cascadable<C extends Cascadable<C>> {

	/**
	 * Marks the current element (property, parameter etc.) as cascadable.
	 *
	 * @return The current creational context following the method chaining pattern.
	 */
	C valid();

	/**
	 * Adds a group conversion for this cascadable element. Several conversions may be configured for one element.
	 *
	 * @param from the source group of the conversion to be configured
	 *
	 * @return a creational context allow to set the target group of the conversion
	 */
	GroupConversionTargetContext<C> convertGroup(Class<?> from);
}
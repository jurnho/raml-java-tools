/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.pojotoraml.plugins;

import org.raml.builder.AnyShapeBuilder;
import org.raml.builder.PropertyShapeBuilder;
import org.raml.pojotoraml.Property;
import org.raml.pojotoraml.RamlAdjuster;

import java.util.List;

/**
 * Created. There, you have it.
 */
public class ChangeTypeName extends RamlAdjuster.Helper {

  final private List<String> arguments;

  public ChangeTypeName(List<String> arguments) {
    this.arguments = arguments;
  }


  @Override
  public String adjustTypeName(Class<?> type, String name) {

    return arguments.get(0);
  }

  @Override
  public PropertyShapeBuilder adjustScalarProperty(AnyShapeBuilder typeDeclaration, Property property,
                                                   PropertyShapeBuilder propertyShapeBuilder) {
    return propertyShapeBuilder;
  }

  @Override
  public PropertyShapeBuilder adjustComposedProperty(AnyShapeBuilder typeDeclaration, Property property,
                                                     PropertyShapeBuilder propertyShapeBuilder) {
    return propertyShapeBuilder;
  }
}

package org.raml.ramltopojo;

import org.raml.v2.api.model.v10.api.Api;
import org.raml.v2.api.model.v10.datamodel.TypeDeclaration;

/**
 * Created. There, you have it.
 */
public interface TypeFinder {

    Iterable<TypeDeclaration> findTypes(Api api);
}

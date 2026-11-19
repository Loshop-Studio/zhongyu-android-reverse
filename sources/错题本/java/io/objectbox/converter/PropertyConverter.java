package io.objectbox.converter;

/* loaded from: classes3.dex */
public interface PropertyConverter<P, D> {
    D convertToDatabaseValue(P p6);

    P convertToEntityProperty(D d9);
}

package io.objectbox.converter;

/* loaded from: classes6.dex */
public interface PropertyConverter<P, D> {
    D convertToDatabaseValue(P p10);

    P convertToEntityProperty(D d10);
}

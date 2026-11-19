package io.objectbox.converter;

/* loaded from: classes5.dex */
public interface PropertyConverter<P, D> {
    D convertToDatabaseValue(P p9);

    P convertToEntityProperty(D d10);
}

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.n */
/* loaded from: classes3.dex */
public class C4702n extends AbstractC4700l {

    /* renamed from: d */
    public static final UriMatcher f2313d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f2313d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C4702n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC4692d
    /* renamed from: a */
    public Class mo2580a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC4700l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo2581c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC4700l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo2582f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM2615i = m2615i(uri, contentResolver);
        if (inputStreamM2615i != null) {
            return inputStreamM2615i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream m2615i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f2313d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m2616j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m2616j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream m2616j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}

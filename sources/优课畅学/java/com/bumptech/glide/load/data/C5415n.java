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
public class C5415n extends AbstractC5413l {

    /* renamed from: d */
    public static final UriMatcher f2955d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f2955d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5415n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5405d
    /* renamed from: a */
    public Class mo2846a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5413l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo2847c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5413l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public InputStream mo2848e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM2880h = m2880h(uri, contentResolver);
        if (inputStreamM2880h != null) {
            return inputStreamM2880h;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: h */
    public final InputStream m2880h(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f2955d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m2881i(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m2881i(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: i */
    public final InputStream m2881i(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}

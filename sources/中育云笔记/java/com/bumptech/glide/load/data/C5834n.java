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
public class C5834n extends AbstractC5832l {

    /* renamed from: f */
    public static final UriMatcher f4725f;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f4725f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5834n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5824d
    /* renamed from: a */
    public Class mo4051a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5832l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo4052b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5832l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo4053d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM4084g = m4084g(uri, contentResolver);
        if (inputStreamM4084g != null) {
            return inputStreamM4084g;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: g */
    public final InputStream m4084g(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f4725f.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m4085h(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m4085h(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: h */
    public final InputStream m4085h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}

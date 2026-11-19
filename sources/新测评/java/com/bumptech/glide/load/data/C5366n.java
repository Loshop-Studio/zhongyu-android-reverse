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
public class C5366n extends AbstractC5364l {

    /* renamed from: d */
    public static final UriMatcher f3522d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3522d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5366n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5356d
    /* renamed from: a */
    public Class mo3399a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.AbstractC5364l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo3400c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.bumptech.glide.load.data.AbstractC5364l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo3401f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM3434i = m3434i(uri, contentResolver);
        if (inputStreamM3434i != null) {
            return inputStreamM3434i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream m3434i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f3522d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m3435j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m3435j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream m3435j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}

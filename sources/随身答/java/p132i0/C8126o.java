package p132i0;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i0.o */
/* loaded from: classes3.dex */
public class C8126o extends AbstractC8123l {

    /* renamed from: d */
    public static final UriMatcher f13895d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13895d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C8126o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // p132i0.InterfaceC8115d
    /* renamed from: a */
    public Class mo12978a() {
        return InputStream.class;
    }

    @Override // p132i0.AbstractC8123l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo12979c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p132i0.AbstractC8123l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo12980f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM13017i = m13017i(uri, contentResolver);
        if (inputStreamM13017i != null) {
            return inputStreamM13017i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: i */
    public final InputStream m13017i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f13895d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m13018j(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m13018j(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    public final InputStream m13018j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }
}

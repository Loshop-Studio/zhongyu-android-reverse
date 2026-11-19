package p169l5;

import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.board.EzySource;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l5.d */
/* loaded from: classes4.dex */
public final class C8890d implements InterfaceC8891e {

    /* renamed from: a */
    public final RecordEntity f14700a;

    /* renamed from: b */
    public String f14701b;

    public C8890d(RecordEntity recordEntity) {
        Intrinsics.checkNotNullParameter(recordEntity, "recordEntity");
        this.f14700a = recordEntity;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo13811a(String sourceFileName, int i9) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Iterator<TARGET> it = this.f14700a.m7637i().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((TouchRecordEntity) next).getFileName(), sourceFileName)) {
                break;
            }
        }
        TouchRecordEntity touchRecordEntity = (TouchRecordEntity) next;
        if (touchRecordEntity != null) {
            return C8888b.f14696a.m13824f((TouchEventEntity) touchRecordEntity.m7717c().get(i9));
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo13812b(String sourceFileName, int i9) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Iterator<TARGET> it = this.f14700a.m7634f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((MatrixRecordEntity) next).getFileName(), sourceFileName)) {
                break;
            }
        }
        MatrixRecordEntity matrixRecordEntity = (MatrixRecordEntity) next;
        if (matrixRecordEntity != null) {
            return C8888b.f14696a.m13822d((MatrixEventEntity) matrixRecordEntity.m7584c().get(i9));
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo13813c(String sourceFileName, int i9) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Iterator<TARGET> it = this.f14700a.m7636h().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((TextRecordEntity) next).getFileName(), sourceFileName)) {
                break;
            }
        }
        TextRecordEntity textRecordEntity = (TextRecordEntity) next;
        if (textRecordEntity != null) {
            return C8888b.f14696a.m13823e((TextInfoEntity) textRecordEntity.m7675c().get(i9));
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo13814d(String sourceFileName, int i9) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Iterator<TARGET> it = this.f14700a.m7632d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((GeometryRecordEntity) next).getFileName(), sourceFileName)) {
                break;
            }
        }
        GeometryRecordEntity geometryRecordEntity = (GeometryRecordEntity) next;
        if (geometryRecordEntity != null) {
            return C8888b.f14696a.m13821c((GeometryInfoEntity) geometryRecordEntity.m7505b().get(i9));
        }
        return null;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo13815e(String sourceFileName, int i9) {
        Object next;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Iterator<TARGET> it = this.f14700a.m7631c().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((FileRecordEntity) next).getFileName(), sourceFileName)) {
                break;
            }
        }
        FileRecordEntity fileRecordEntity = (FileRecordEntity) next;
        if (fileRecordEntity != null) {
            return C8888b.f14696a.m13820b((FileInfoEntity) fileRecordEntity.m7464a().get(i9));
        }
        return null;
    }

    /* renamed from: f */
    public void m13828f(String pageRootPath) {
        Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
        this.f14701b = pageRootPath;
    }

    @Override // p169l5.InterfaceC8891e
    public String path() {
        return this.f14701b;
    }
}

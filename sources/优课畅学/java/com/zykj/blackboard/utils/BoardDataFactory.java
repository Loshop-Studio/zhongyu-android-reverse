package com.zykj.blackboard.utils;

import com.zykj.board.EzyHeader;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class BoardDataFactory {
    public static final Companion Companion = new Companion(null);
    public static final int supportLastVersion = 6;
    public static final int version = 6;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzyHeader.Header buildHead(int i10, int i11, Long l10, long j10, EzyHeader.Author author, List<EzyHeader.Author> list) {
            EzyHeader.Header.C7214b c7214bM8079J = EzyHeader.Header.m8079J();
            c7214bM8079J.m8144Y(6);
            c7214bM8079J.m8145Z(i10);
            c7214bM8079J.m8137R(i11);
            c7214bM8079J.m8132M(new Date().getTime());
            c7214bM8079J.m8135P(j10);
            if (l10 != null) {
                c7214bM8079J.m8143X(l10.longValue());
            }
            if (author != null) {
                c7214bM8079J.m8131L(author);
            }
            if (list != null) {
                c7214bM8079J.m8146c(list);
            }
            EzyHeader.Header headerBuild = c7214bM8079J.build();
            AbstractC9133u.m16132f(headerBuild, "header.build()");
            return headerBuild;
        }

        private Companion() {
        }
    }
}

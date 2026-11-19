package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p280od.InterfaceC10469c;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {

    @InterfaceC11829d(m26210c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2", m26211f = "RoomDatabase.kt", m26212l = {468}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 */
    public static final class C44732 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ RoomDatabase $this_useReaderConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44732(RoomDatabase roomDatabase, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C44732> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_useReaderConnection = roomDatabase;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44732(this.$this_useReaderConnection, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            RoomDatabase roomDatabase = this.$this_useReaderConnection;
            InterfaceC9544p interfaceC9544p = this.$block;
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(true, interfaceC9544p, this);
            return objUseConnection$room_runtime_release == objM25952f ? objM25952f : objUseConnection$room_runtime_release;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C44732) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", m26211f = "RoomDatabase.kt", m26212l = {496}, m26213m = "useWriterConnection")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 */
    public static final class C44741<R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C44741(InterfaceC11588c<? super C44741> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.useWriterConnection(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2", m26211f = "RoomDatabase.kt", m26212l = {496}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 */
    public static final class C44752 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ RoomDatabase $this_useWriterConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44752(RoomDatabase roomDatabase, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C44752> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_useWriterConnection = roomDatabase;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44752(this.$this_useWriterConnection, this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            RoomDatabase roomDatabase = this.$this_useWriterConnection;
            InterfaceC9544p interfaceC9544p = this.$block;
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, interfaceC9544p, this);
            return objUseConnection$room_runtime_release == objM25952f ? objM25952f : objUseConnection$room_runtime_release;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
            return ((C44752) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final <R> Object useReaderConnection(RoomDatabase roomDatabase, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super R> interfaceC11588c) {
        return AbstractC11109f.m24709g(roomDatabase.getCoroutineScope().getCoroutineContext(), new C44732(roomDatabase, interfaceC9544p, null), interfaceC11588c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object useWriterConnection(androidx.room.RoomDatabase r5, p181hd.InterfaceC9544p r6, vc.InterfaceC11588c<? super R> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt.C44741
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt.C44741) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            kotlin.AbstractC9924b.m20071b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r7)
            sd.i0 r7 = r5.getCoroutineScope()
            kotlin.coroutines.d r7 = r7.getCoroutineContext()
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = sd.AbstractC11109f.m24709g(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            androidx.room.InvalidationTracker r5 = r5.getInvalidationTracker()
            r5.refreshAsync()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(androidx.room.RoomDatabase, hd.p, vc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void validateAutoMigrations(androidx.room.RoomDatabase r9, androidx.room.DatabaseConfiguration r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r10, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r9.getRequiredAutoMigrationSpecClasses()
            java.util.List<androidx.room.migration.AutoMigrationSpec> r2 = r10.autoMigrationSpecs
            int r2 = r2.size()
            boolean[] r3 = new boolean[r2]
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r4 = r1.hasNext()
            r5 = -1
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r1.next()
            od.c r4 = (p280od.InterfaceC10469c) r4
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.util.Collection r6 = (java.util.Collection) r6
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L4f
        L37:
            int r7 = r6 + (-1)
            java.util.List<androidx.room.migration.AutoMigrationSpec> r8 = r10.autoMigrationSpecs
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.mo20275d(r8)
            if (r8 == 0) goto L4a
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L4f
        L4a:
            if (r7 >= 0) goto L4d
            goto L4f
        L4d:
            r6 = r7
            goto L37
        L4f:
            if (r5 < 0) goto L5b
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L1f
        L5b:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required auto migration spec ("
            r9.append(r10)
            java.lang.String r10 = r4.mo20276e()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7f:
            java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r10.autoMigrationSpecs
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L9f
        L8a:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L97
            boolean r1 = r3[r1]
            if (r1 == 0) goto L97
            if (r4 >= 0) goto L95
            goto L9f
        L95:
            r1 = r4
            goto L8a
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L9f:
            java.util.List r9 = r9.createAutoMigrations(r0)
            java.util.Iterator r9 = r9.iterator()
        La7:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r0 = r9.next()
            androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            int r2 = r0.startVersion
            int r3 = r0.endVersion
            boolean r1 = r1.contains(r2, r3)
            if (r1 != 0) goto La7
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            r1.addMigration(r0)
            goto La7
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(androidx.room.RoomDatabase, androidx.room.DatabaseConfiguration):void");
    }

    public static final void validateMigrationsNotRequired(Set<Integer> migrationStartAndEndVersions, Set<Integer> migrationsNotRequiredFrom) {
        AbstractC9979u.m20294g(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        AbstractC9979u.m20294g(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
        if (migrationStartAndEndVersions.isEmpty()) {
            return;
        }
        Iterator<Integer> it = migrationStartAndEndVersions.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (migrationsNotRequiredFrom.contains(Integer.valueOf(iIntValue))) {
                throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: " + iIntValue).toString());
            }
        }
    }

    public static final void validateTypeConverters(RoomDatabase roomDatabase, DatabaseConfiguration configuration) {
        AbstractC9979u.m20294g(roomDatabase, "<this>");
        AbstractC9979u.m20294g(configuration, "configuration");
        Map<InterfaceC10469c, List<InterfaceC10469c>> requiredTypeConverterClassesMap$room_runtime_release = roomDatabase.getRequiredTypeConverterClassesMap$room_runtime_release();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry<InterfaceC10469c, List<InterfaceC10469c>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
            InterfaceC10469c key = entry.getKey();
            for (InterfaceC10469c interfaceC10469c : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (interfaceC10469c.mo20275d(configuration.typeConverters.get(size))) {
                            zArr[size] = true;
                            break;
                        } else if (i10 < 0) {
                            break;
                        } else {
                            size = i10;
                        }
                    }
                    size = -1;
                } else {
                    size = -1;
                }
                if (size < 0) {
                    throw new IllegalArgumentException(("A required type converter (" + interfaceC10469c.mo20276e() + ") for " + key.mo20276e() + " is missing in the database configuration.").toString());
                }
                roomDatabase.addTypeConverter$room_runtime_release(interfaceC10469c, configuration.typeConverters.get(size));
            }
        }
        int size2 = configuration.typeConverters.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            if (!zArr[size2]) {
                throw new IllegalArgumentException("Unexpected type converter " + configuration.typeConverters.get(size2) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }
}

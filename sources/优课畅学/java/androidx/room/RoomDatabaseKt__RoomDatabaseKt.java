package androidx.room;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabaseKt {

    @InterfaceC9539d(m17800c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2", m17801f = "RoomDatabase.kt", m17802l = {468}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 */
    public static final class C45252 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ RoomDatabase $this_useReaderConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45252(RoomDatabase roomDatabase, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C45252> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_useReaderConnection = roomDatabase;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C45252(this.$this_useReaderConnection, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C45252) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            RoomDatabase roomDatabase = this.$this_useReaderConnection;
            InterfaceC10574p interfaceC10574p = this.$block;
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(true, interfaceC10574p, this);
            return objUseConnection$room_runtime_release == objM17291f ? objM17291f : objUseConnection$room_runtime_release;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", m17801f = "RoomDatabase.kt", m17802l = {496}, m17803m = "useWriterConnection")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 */
    public static final class C45261<R> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C45261(InterfaceC9324c<? super C45261> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RoomDatabaseKt.useWriterConnection(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2", m17801f = "RoomDatabase.kt", m17802l = {496}, m17803m = "invokeSuspend")
    /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 */
    public static final class C45272 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ RoomDatabase $this_useWriterConnection;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45272(RoomDatabase roomDatabase, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C45272> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_useWriterConnection = roomDatabase;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C45272(this.$this_useWriterConnection, this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
            return ((C45272) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            RoomDatabase roomDatabase = this.$this_useWriterConnection;
            InterfaceC10574p interfaceC10574p = this.$block;
            this.label = 1;
            Object objUseConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, interfaceC10574p, this);
            return objUseConnection$room_runtime_release == objM17291f ? objM17291f : objUseConnection$room_runtime_release;
        }
    }

    public static final <R> Object useReaderConnection(RoomDatabase roomDatabase, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super R> interfaceC9324c) {
        return AbstractC8833f.m14848g(roomDatabase.getCoroutineScope().getCoroutineContext(), new C45252(roomDatabase, interfaceC10574p, null), interfaceC9324c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object useWriterConnection(androidx.room.RoomDatabase r5, p300x7.InterfaceC10574p r6, p179m7.InterfaceC9324c<? super R> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof androidx.room.RoomDatabaseKt__RoomDatabaseKt.C45261
            if (r0 == 0) goto L13
            r0 = r7
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1 r0 = (androidx.room.RoomDatabaseKt__RoomDatabaseKt.C45261) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.room.RoomDatabase r5 = (androidx.room.RoomDatabase) r5
            kotlin.AbstractC9079b.m15926b(r7)
            goto L51
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r7)
            i8.b0 r7 = r5.getCoroutineScope()
            kotlin.coroutines.d r7 = r7.getCoroutineContext()
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r2 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = p135i8.AbstractC8833f.m14848g(r7, r2, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            androidx.room.InvalidationTracker r5 = r5.getInvalidationTracker()
            r5.refreshAsync()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.useWriterConnection(androidx.room.RoomDatabase, x7.p, m7.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void validateAutoMigrations(androidx.room.RoomDatabase r9, androidx.room.DatabaseConfiguration r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r9, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r10, r0)
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
            if (r4 == 0) goto L7d
            java.lang.Object r4 = r1.next()
            e8.c r4 = (p089e8.InterfaceC8375c) r4
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            int r6 = r6.size()
            int r6 = r6 + r5
            if (r6 < 0) goto L4d
        L35:
            int r7 = r6 + (-1)
            java.util.List<androidx.room.migration.AutoMigrationSpec> r8 = r10.autoMigrationSpecs
            java.lang.Object r8 = r8.get(r6)
            boolean r8 = r4.mo13670c(r8)
            if (r8 == 0) goto L48
            r5 = 1
            r3[r6] = r5
            r5 = r6
            goto L4d
        L48:
            if (r7 >= 0) goto L4b
            goto L4d
        L4b:
            r6 = r7
            goto L35
        L4d:
            if (r5 < 0) goto L59
            java.util.List<androidx.room.migration.AutoMigrationSpec> r6 = r10.autoMigrationSpecs
            java.lang.Object r5 = r6.get(r5)
            r0.put(r4, r5)
            goto L1f
        L59:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "A required auto migration spec ("
            r9.append(r10)
            java.lang.String r10 = r4.mo13671e()
            r9.append(r10)
            java.lang.String r10 = ") is missing in the database configuration."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7d:
            java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r10.autoMigrationSpecs
            int r1 = r1.size()
            int r1 = r1 + r5
            if (r1 < 0) goto L9b
        L86:
            int r4 = r1 + (-1)
            if (r1 >= r2) goto L93
            boolean r1 = r3[r1]
            if (r1 == 0) goto L93
            if (r4 >= 0) goto L91
            goto L9b
        L91:
            r1 = r4
            goto L86
        L93:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
            r9.<init>(r10)
            throw r9
        L9b:
            java.util.List r9 = r9.createAutoMigrations(r0)
            java.util.Iterator r9 = r9.iterator()
        La3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r9.next()
            androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            int r2 = r0.startVersion
            int r3 = r0.endVersion
            boolean r1 = r1.contains(r2, r3)
            if (r1 != 0) goto La3
            androidx.room.RoomDatabase$MigrationContainer r1 = r10.migrationContainer
            r1.addMigration(r0)
            goto La3
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt.validateAutoMigrations(androidx.room.RoomDatabase, androidx.room.DatabaseConfiguration):void");
    }

    public static final void validateMigrationsNotRequired(Set<Integer> migrationStartAndEndVersions, Set<Integer> migrationsNotRequiredFrom) {
        AbstractC9133u.m16133g(migrationStartAndEndVersions, "migrationStartAndEndVersions");
        AbstractC9133u.m16133g(migrationsNotRequiredFrom, "migrationsNotRequiredFrom");
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
        AbstractC9133u.m16133g(roomDatabase, "<this>");
        AbstractC9133u.m16133g(configuration, "configuration");
        Map<InterfaceC8375c, List<InterfaceC8375c>> requiredTypeConverterClassesMap$room_runtime_release = roomDatabase.getRequiredTypeConverterClassesMap$room_runtime_release();
        boolean[] zArr = new boolean[configuration.typeConverters.size()];
        for (Map.Entry<InterfaceC8375c, List<InterfaceC8375c>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
            InterfaceC8375c key = entry.getKey();
            for (InterfaceC8375c interfaceC8375c : entry.getValue()) {
                int size = configuration.typeConverters.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i10 = size - 1;
                        if (interfaceC8375c.mo13670c(configuration.typeConverters.get(size))) {
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
                    throw new IllegalArgumentException(("A required type converter (" + interfaceC8375c.mo13671e() + ") for " + key.mo13671e() + " is missing in the database configuration.").toString());
                }
                roomDatabase.addTypeConverter$room_runtime_release(interfaceC8375c, configuration.typeConverters.get(size));
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

.class public abstract synthetic Lkotlinx/coroutines/flow/FlowKt__ZipKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a()Lx7/a;
    .locals 1

    .line 1
    invoke-static {}, Lkotlinx/coroutines/flow/FlowKt__ZipKt;->e()Lx7/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final b(Ll8/c;Ll8/c;Ll8/c;Lx7/r;)Ll8/c;
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v0, v0, [Ll8/c;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput-object p0, v0, v1

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    aput-object p1, v0, p0

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    aput-object p2, v0, p0

    .line 12
    .line 13
    new-instance p0, Lkotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;

    .line 14
    .line 15
    invoke-direct {p0, v0, p3}, Lkotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;-><init>([Ll8/c;Lx7/r;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public static final c(Ll8/c;Ll8/c;Lx7/q;)Ll8/c;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ll8/e;->C(Ll8/c;Ll8/c;Lx7/q;)Ll8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final d(Ll8/c;Ll8/c;Lx7/q;)Ll8/c;
    .locals 1

    .line 1
    new-instance v0, Lkotlinx/coroutines/flow/FlowKt__ZipKt$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lkotlinx/coroutines/flow/FlowKt__ZipKt$a;-><init>(Ll8/c;Ll8/c;Lx7/q;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final e()Lx7/a;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/coroutines/flow/FlowKt__ZipKt$nullArrayFactory$1;->a:Lkotlinx/coroutines/flow/FlowKt__ZipKt$nullArrayFactory$1;

    .line 2
    .line 3
    return-object v0
.end method

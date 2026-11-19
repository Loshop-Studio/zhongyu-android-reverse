.class public final Le5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le5/b;

    .line 2
    .line 3
    invoke-direct {v0}, Le5/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le5/b;->a:Le5/b;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(ILl5/e;Lz4/a;La5/c;)Le5/a;
    .locals 1

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrixAdapter"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "graphControl"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x6

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    new-instance p1, Lf5/c;

    .line 20
    .line 21
    invoke-direct {p1, p2, p3, p4}, Lf5/c;-><init>(Ll5/e;Lz4/a;La5/c;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance p1, Lf5/c;

    .line 26
    .line 27
    invoke-direct {p1, p2, p3, p4}, Lf5/c;-><init>(Ll5/e;Lz4/a;La5/c;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.class public Lo6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lo6/a;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Lkotlin/io/encoding/Base64$PaddingOption;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lo6/a;

    .line 2
    .line 3
    sget-object v1, Lkotlin/io/encoding/Base64$PaddingOption;->PRESENT:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, -0x1

    .line 7
    invoke-direct {v0, v2, v2, v3, v1}, Lo6/b;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lo6/b;->d:Lo6/a;

    .line 11
    .line 12
    new-instance v0, Lo6/b;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    invoke-direct {v0, v4, v2, v3, v1}, Lo6/b;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lo6/b;

    .line 19
    .line 20
    const/16 v3, 0x4c

    .line 21
    .line 22
    invoke-direct {v0, v2, v4, v3, v1}, Lo6/b;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lo6/b;

    .line 26
    .line 27
    const/16 v3, 0x40

    .line 28
    .line 29
    invoke-direct {v0, v2, v4, v3, v1}, Lo6/b;-><init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(ZZILkotlin/io/encoding/Base64$PaddingOption;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lo6/b;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lo6/b;->b:Z

    .line 7
    .line 8
    iput-object p4, p0, Lo6/b;->c:Lkotlin/io/encoding/Base64$PaddingOption;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    if-nez p2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const-string p2, "Failed requirement."

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

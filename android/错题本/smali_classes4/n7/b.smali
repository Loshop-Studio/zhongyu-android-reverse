.class public abstract Ln7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ln7/a;


# instance fields
.field public final a:Ln7/g;

.field public final b:Lo7/e;

.field public final c:Lo2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Ln7/a;

    .line 2
    .line 3
    new-instance v1, Ln7/g;

    .line 4
    .line 5
    const/4 v7, 0x1

    .line 6
    sget-object v8, Lkotlinx/serialization/json/ClassDiscriminatorMode;->POLYMORPHIC:Lkotlinx/serialization/json/ClassDiscriminatorMode;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const-string v5, "    "

    .line 12
    .line 13
    const-string v6, "type"

    .line 14
    .line 15
    invoke-direct/range {v1 .. v8}, Ln7/g;-><init>(ZZZLjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/json/ClassDiscriminatorMode;)V

    .line 16
    .line 17
    .line 18
    sget-object v2, Lo7/g;->a:Lo7/d;

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Ln7/b;-><init>(Ln7/g;Lo7/e;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Ln7/b;->d:Ln7/a;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Ln7/g;Lo7/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln7/b;->a:Ln7/g;

    .line 5
    .line 6
    iput-object p2, p0, Ln7/b;->b:Lo7/e;

    .line 7
    .line 8
    new-instance p1, Lo2/a;

    .line 9
    .line 10
    const/16 p2, 0x14

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lo2/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ln7/b;->c:Lo2/a;

    .line 16
    .line 17
    return-void
.end method

.class public abstract Lm8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ln8/d0;

.field public static final b:Ln8/d0;

.field public static final c:Ln8/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ln8/d0;

    .line 2
    .line 3
    const-string v1, "NULL"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln8/d0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm8/l;->a:Ln8/d0;

    .line 9
    .line 10
    new-instance v0, Ln8/d0;

    .line 11
    .line 12
    const-string v1, "UNINITIALIZED"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ln8/d0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lm8/l;->b:Ln8/d0;

    .line 18
    .line 19
    new-instance v0, Ln8/d0;

    .line 20
    .line 21
    const-string v1, "DONE"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ln8/d0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lm8/l;->c:Ln8/d0;

    .line 27
    .line 28
    return-void
.end method

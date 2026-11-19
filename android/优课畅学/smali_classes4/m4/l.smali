.class public abstract Lm4/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/l$a;,
        Lm4/l$b;,
        Lm4/l$c;
    }
.end annotation


# static fields
.field public static final a:Lm4/l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm4/l$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm4/l$c;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm4/l;->a:Lm4/l$c;

    .line 8
    .line 9
    return-void
.end method

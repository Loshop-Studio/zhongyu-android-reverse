.class public abstract Lm4/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/j$a;,
        Lm4/j$b;,
        Lm4/j$c;
    }
.end annotation


# static fields
.field public static final a:Lm4/j$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm4/j$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm4/j$c;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm4/j;->a:Lm4/j$c;

    .line 8
    .line 9
    return-void
.end method

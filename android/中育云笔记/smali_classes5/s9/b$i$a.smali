.class public final Ls9/b$i$a;
.super Ls9/b$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls9/b$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final a:Ls9/b$i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ls9/b$i$a;

    .line 2
    .line 3
    invoke-direct {v0}, Ls9/b$i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls9/b$i$a;->a:Ls9/b$i$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ls9/b$i;-><init>(Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

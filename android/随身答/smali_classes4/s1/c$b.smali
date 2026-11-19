.class public Ls1/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ls1/c$b;-><init>(Ls1/c$a;)V

    return-void
.end method

.method public constructor <init>(Ls1/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ls1/a;
    .locals 2

    .line 1
    new-instance v0, Ls1/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Ls1/c;-><init>(Ljava/lang/String;Ls1/c$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

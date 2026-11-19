.class public Ly1/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly1/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ly1/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Lz1/b$b;
    .locals 1

    .line 1
    new-instance v0, Lz1/b$b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lz1/b$b;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public bridge synthetic c(I)Lz1/c$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly1/b$b;->a(I)Lz1/b$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

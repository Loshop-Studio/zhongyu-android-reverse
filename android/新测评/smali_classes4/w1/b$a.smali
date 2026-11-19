.class public Lw1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
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
.method public a(Landroid/content/Context;Landroid/net/Uri;I)Lw1/a;
    .locals 1

    .line 1
    new-instance v0, Lw1/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lw1/b;-><init>(Landroid/content/Context;Landroid/net/Uri;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

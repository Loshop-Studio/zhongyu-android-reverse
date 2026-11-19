.class public Lz/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/c;Lz/h;Lz/n;Landroid/content/Context;)Lcom/bumptech/glide/g;
    .locals 1

    .line 1
    new-instance v0, Lcom/bumptech/glide/g;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lcom/bumptech/glide/g;-><init>(Lcom/bumptech/glide/c;Lz/h;Lz/n;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.class public final Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/adapter/FullScreenPreviewAdapter;->k(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/main/adapter/FullScreenPreviewAdapter;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/friday/main/adapter/FullScreenPreviewAdapter;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;->a:Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;->b:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Lw/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(Lw/g;)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(Lw/g;Lw/r;)V
    .locals 0

    .line 1
    return-void
.end method

.method public d(Lw/g;Lw/d;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;->a:Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/friday/main/adapter/FullScreenPreviewAdapter;->i(Lcom/friday/main/adapter/FullScreenPreviewAdapter;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p2, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;->a:Lcom/friday/main/adapter/FullScreenPreviewAdapter;

    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    iget-object v0, p0, Lcom/friday/main/adapter/FullScreenPreviewAdapter$c;->b:Ljava/io/File;

    .line 14
    .line 15
    invoke-interface {p2, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

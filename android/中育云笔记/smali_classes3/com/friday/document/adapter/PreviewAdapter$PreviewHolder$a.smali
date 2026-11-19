.class public final Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder;->b(Ljava/io/File;Ljava/util/ArrayList;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    iput p2, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;->b:I

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
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget p2, p0, Lcom/friday/document/adapter/PreviewAdapter$PreviewHolder$a;->b:I

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

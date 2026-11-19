.class public final Lcom/friday/paint/view/six/NewThumbnailListAdapter$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/g$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewThumbnailListAdapter;->convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/paint/model/NoteListEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewThumbnailListAdapter$b;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
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
    iget-object p1, p0, Lcom/friday/paint/view/six/NewThumbnailListAdapter$b;->a:Landroid/widget/ImageView;

    .line 2
    .line 3
    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

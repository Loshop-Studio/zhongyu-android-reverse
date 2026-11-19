.class public final synthetic Lu2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/NewestPreviewFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/NewestPreviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/v;->c:Lcom/friday/document/view/NewestPreviewFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/v;->c:Lcom/friday/document/view/NewestPreviewFragment;

    check-cast p1, Lcom/friday/common/entity/FileEntity;

    invoke-static {v0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->w(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p1

    return-object p1
.end method

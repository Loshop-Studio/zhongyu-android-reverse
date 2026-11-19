.class public final synthetic Lv2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/document/BaseDocumentFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/document/BaseDocumentFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv2/a;->c:Lcom/friday/document/view/document/BaseDocumentFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lv2/a;->c:Lcom/friday/document/view/document/BaseDocumentFragment;

    invoke-static {v0, p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->r(Lcom/friday/document/view/document/BaseDocumentFragment;Ljava/lang/Object;)V

    return-void
.end method

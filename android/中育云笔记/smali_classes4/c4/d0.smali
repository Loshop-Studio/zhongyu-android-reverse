.class public final synthetic Lc4/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/ThePaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/d0;->a:Lcom/friday/paint/view/ThePaintFragment;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/d0;->a:Lcom/friday/paint/view/ThePaintFragment;

    invoke-static {v0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->s(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V

    return-void
.end method

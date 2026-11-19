.class public final synthetic Ld4/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lkotlin/jvm/internal/Ref$LongRef;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$LongRef;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/r0;->c:Lkotlin/jvm/internal/Ref$LongRef;

    iput-object p2, p0, Ld4/r0;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ld4/r0;->c:Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v1, p0, Ld4/r0;->d:Lhd/l;

    invoke-static {v0, v1, p1}, Lcom/friday/paint/view/six/i;->a(Lkotlin/jvm/internal/Ref$LongRef;Lhd/l;Landroid/view/View;)V

    return-void
.end method

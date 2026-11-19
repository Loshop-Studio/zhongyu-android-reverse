.class public final synthetic Ll4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/policy/ui/PolicyDetailActivity;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/policy/ui/PolicyDetailActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll4/c;->a:Lcom/zykj/policy/ui/PolicyDetailActivity;

    iput-object p2, p0, Ll4/c;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ll4/c;->a:Lcom/zykj/policy/ui/PolicyDetailActivity;

    iget-object v1, p0, Ll4/c;->b:Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static {v0, v1}, Lcom/zykj/policy/ui/PolicyDetailActivity;->m(Lcom/zykj/policy/ui/PolicyDetailActivity;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    return-void
.end method

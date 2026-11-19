.class public final synthetic Lq3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>(ILx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq3/g;->a:I

    iput-object p2, p0, Lq3/g;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lq3/g;->a:I

    iget-object v1, p0, Lq3/g;->b:Lx7/l;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/lib/login/ui/teacher/pwd/a;->h(ILx7/l;Ljava/lang/String;)Lh7/p;

    move-result-object p1

    return-object p1
.end method

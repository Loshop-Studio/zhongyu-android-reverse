.class public final synthetic Lb/d/b/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/zykj/satisfaction/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/satisfaction/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/d/b/a;->b:Lcom/zykj/satisfaction/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb/d/b/a;->b:Lcom/zykj/satisfaction/MainActivity;

    const-string v1, "this$0"

    .line 1
    invoke-static {v0, v1}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-boolean v1, Lcom/zykj/satisfaction/MainActivity;->u:Z

    .line 3
    invoke-static {v0}, Lcom/zykj/satisfaction/MainActivity;->v(Lcom/zykj/satisfaction/MainActivity;)V

    const/4 v0, 0x0

    .line 4
    sput-boolean v0, Lcom/zykj/satisfaction/MainActivity;->u:Z

    return-void
.end method

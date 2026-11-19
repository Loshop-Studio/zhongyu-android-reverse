.class public final Lcom/zykj/message/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field public static final b:Lcom/zykj/message/a;

.field public static final c:Lcom/zykj/message/a;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/message/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/message/a;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/message/a;->b:Lcom/zykj/message/a;

    .line 8
    .line 9
    new-instance v0, Lcom/zykj/message/a;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lcom/zykj/message/a;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/zykj/message/a;->c:Lcom/zykj/message/a;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/message/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lcom/zykj/message/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/zykj/message/client/b;->e:Lcom/zykj/message/client/b;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/message/client/b;->a()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object p1, Lcom/zykj/message/client/b;->e:Lcom/zykj/message/client/b;

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/message/client/b;->a()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

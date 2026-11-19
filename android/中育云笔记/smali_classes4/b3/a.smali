.class public final synthetic Lb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/common/classtest/MqttResponse$Student;

.field public final synthetic d:Lcom/friday/lecture/adapter/OnlineListAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/lecture/adapter/OnlineListAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/a;->c:Lcom/friday/common/classtest/MqttResponse$Student;

    iput-object p2, p0, Lb3/a;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb3/a;->c:Lcom/friday/common/classtest/MqttResponse$Student;

    iget-object v1, p0, Lb3/a;->d:Lcom/friday/lecture/adapter/OnlineListAdapter;

    invoke-static {v0, v1, p1}, Lcom/friday/lecture/adapter/OnlineListAdapter;->i(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/lecture/adapter/OnlineListAdapter;Landroid/view/View;)V

    return-void
.end method

.class public final synthetic Lj3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/common/classtest/MqttResponse$Student;

    check-cast p2, Lcom/friday/common/classtest/MqttResponse$Student;

    invoke-static {p1, p2}, Lcom/friday/lecture/model/ClassTestHelper;->a(Lcom/friday/common/classtest/MqttResponse$Student;Lcom/friday/common/classtest/MqttResponse$Student;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

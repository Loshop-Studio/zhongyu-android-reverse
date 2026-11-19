.class public final Lcom/dylanc/longan/BluetoothStateLiveData$a;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/dylanc/longan/BluetoothStateLiveData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lcom/dylanc/longan/BluetoothStateLiveData;


# direct methods
.method public constructor <init>(Lcom/dylanc/longan/BluetoothStateLiveData;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 7
    .line 8
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    .line 1
    const-string v0, "android.bluetooth.device.extra.DEVICE"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/bluetooth/BluetoothDevice;

    .line 8
    .line 9
    return-object p1
.end method

.method public final b(Landroid/content/Intent;)I
    .locals 2

    .line 1
    const-string v0, "android.bluetooth.adapter.extra.STATE"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "intent"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_c

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const v1, -0x5b36f014

    .line 22
    .line 23
    .line 24
    if-eq v0, v1, :cond_8

    .line 25
    .line 26
    const v1, -0x11f77b4b

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    const v1, 0x6c9330ef

    .line 33
    .line 34
    .line 35
    if-eq v0, v1, :cond_0

    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_0
    const-string v0, "android.bluetooth.device.action.ACL_DISCONNECTED"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 50
    .line 51
    invoke-static {p1}, Lcom/dylanc/longan/BluetoothStateLiveData;->a(Lcom/dylanc/longan/BluetoothStateLiveData;)Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    return-void

    .line 58
    :cond_2
    invoke-virtual {p0, p2}, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-ne p1, v2, :cond_3

    .line 76
    .line 77
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 78
    .line 79
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static {p1, p2}, Lcom/dylanc/longan/BluetoothStateLiveData;->b(Lcom/dylanc/longan/BluetoothStateLiveData;Ljava/lang/Boolean;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    return-void

    .line 85
    :cond_4
    const-string v0, "android.bluetooth.device.action.ACL_CONNECTED"

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 95
    .line 96
    invoke-static {p1}, Lcom/dylanc/longan/BluetoothStateLiveData;->a(Lcom/dylanc/longan/BluetoothStateLiveData;)Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-nez p1, :cond_6

    .line 101
    .line 102
    return-void

    .line 103
    :cond_6
    invoke-virtual {p0, p2}, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-ne p1, v2, :cond_7

    .line 121
    .line 122
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 123
    .line 124
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-static {p1, p2}, Lcom/dylanc/longan/BluetoothStateLiveData;->b(Lcom/dylanc/longan/BluetoothStateLiveData;Ljava/lang/Boolean;)V

    .line 127
    .line 128
    .line 129
    :cond_7
    return-void

    .line 130
    :cond_8
    const-string v0, "android.bluetooth.adapter.action.STATE_CHANGED"

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_9

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_9
    invoke-virtual {p0, p2}, Lcom/dylanc/longan/BluetoothStateLiveData$a;->b(Landroid/content/Intent;)I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    const/16 p2, 0xa

    .line 144
    .line 145
    if-eq p1, p2, :cond_b

    .line 146
    .line 147
    const/16 p2, 0xc

    .line 148
    .line 149
    if-eq p1, p2, :cond_a

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_a
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 153
    .line 154
    invoke-static {p1}, Lcom/dylanc/longan/BluetoothStateLiveData;->a(Lcom/dylanc/longan/BluetoothStateLiveData;)Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-nez p1, :cond_c

    .line 159
    .line 160
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 161
    .line 162
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 163
    .line 164
    invoke-static {p1, p2}, Lcom/dylanc/longan/BluetoothStateLiveData;->b(Lcom/dylanc/longan/BluetoothStateLiveData;Ljava/lang/Boolean;)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_b
    iget-object p1, p0, Lcom/dylanc/longan/BluetoothStateLiveData$a;->a:Lcom/dylanc/longan/BluetoothStateLiveData;

    .line 169
    .line 170
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-static {p1, p2}, Lcom/dylanc/longan/BluetoothStateLiveData;->b(Lcom/dylanc/longan/BluetoothStateLiveData;Ljava/lang/Boolean;)V

    .line 173
    .line 174
    .line 175
    :cond_c
    :goto_0
    return-void
.end method

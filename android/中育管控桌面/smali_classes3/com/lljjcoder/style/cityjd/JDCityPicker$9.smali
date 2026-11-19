.class Lcom/lljjcoder/style/cityjd/JDCityPicker$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lljjcoder/style/cityjd/JDCityPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;


# direct methods
.method public constructor <init>(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 3

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_3

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    goto/16 :goto_0

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 17
    .line 18
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1802(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1800(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1800(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_4

    .line 53
    .line 54
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 61
    .line 62
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$900(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/AreaAdapter;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 70
    .line 71
    invoke-static {p1, v1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$302(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)I

    .line 72
    .line 73
    .line 74
    goto/16 :goto_0

    .line 75
    .line 76
    :cond_1
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 77
    .line 78
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Ljava/util/List;

    .line 81
    .line 82
    invoke-static {v0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1702(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 86
    .line 87
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$800(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 95
    .line 96
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1700(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 103
    .line 104
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1700(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-nez p1, :cond_4

    .line 113
    .line 114
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 115
    .line 116
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 121
    .line 122
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$800(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/CityAdapter;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 130
    .line 131
    invoke-static {p1, v2}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$302(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)I

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 136
    .line 137
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p1, Ljava/util/List;

    .line 140
    .line 141
    invoke-static {v0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1602(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 151
    .line 152
    .line 153
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 154
    .line 155
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 160
    .line 161
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_3
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 170
    .line 171
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Ljava/util/List;

    .line 174
    .line 175
    invoke-static {v0, p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1602(Lcom/lljjcoder/style/cityjd/JDCityPicker;Ljava/util/List;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 179
    .line 180
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 185
    .line 186
    .line 187
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 188
    .line 189
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$500(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Landroid/widget/ListView;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    iget-object v0, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 194
    .line 195
    invoke-static {v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$400(Lcom/lljjcoder/style/cityjd/JDCityPicker;)Lcom/lljjcoder/style/cityjd/ProvinceAdapter;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 200
    .line 201
    .line 202
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 203
    .line 204
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$300(Lcom/lljjcoder/style/cityjd/JDCityPicker;)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    invoke-static {p1, v0}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$1900(Lcom/lljjcoder/style/cityjd/JDCityPicker;I)V

    .line 209
    .line 210
    .line 211
    iget-object p1, p0, Lcom/lljjcoder/style/cityjd/JDCityPicker$9;->this$0:Lcom/lljjcoder/style/cityjd/JDCityPicker;

    .line 212
    .line 213
    invoke-static {p1}, Lcom/lljjcoder/style/cityjd/JDCityPicker;->access$700(Lcom/lljjcoder/style/cityjd/JDCityPicker;)V

    .line 214
    .line 215
    .line 216
    return v2
.end method

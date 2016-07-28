# ListIndexView
display an index of list

 ![image](https://github.com/StevenDXC/ListIndexView/blob/master/Image/demo.gif)


useage:


layout:

```xml
<com.dxc.listindexview.widget.ListIndexView
        android:id="@+id/index_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="right|center_vertical" />
```

```code:
indexView.setIndexLetters(String[]{"A","B",....});
indexView.setOnTouchIndexListener(new ListIndexView.OnTouchIndexListener() {
            @Override
            public void onTouchIndex(int index) {
                
            }
        });
```

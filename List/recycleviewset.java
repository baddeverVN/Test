 rcvLayoutMainCatagories = (RecyclerView) view.findViewById(R.id.rcv_activity_main__list_catagories);
 rcvLayoutMainCatagories.setLayoutManager(new GridLayoutManager(getActivity(), mNumsOfCol));
 rcvLayoutMainCatagories.setHasFixedSize(true);
 rcvLayoutMainCatagories.setAdapter(mAdapter);
 
 =====================
recycleview all


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rcv_test);

        final ArrayList<String> arrItem = new ArrayList<>();
        arrItem.add("hehe");
        arrItem.add("hoho");
        arrItem.add("hoho");
        arrItem.add("hoho");
        arrItem.add("hoho");
        arrItem.add("hoho");
        arrItem.add("hoho");
        arrItem.add("hoho");
        Log.e("test2","size : " + arrItem.size());

        MyAdapter adapter = new MyAdapter(arrItem);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        Log.e("test2","get count : " +  recyclerView.getAdapter().getItemCount());




    }

    class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView txvTest;
        public MyViewHolder(View itemView) {
            super(itemView);
            txvTest = (TextView) itemView.findViewById(R.id.item_text);

        }
    }

    class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
        ArrayList<String> arrData;

        public MyAdapter(ArrayList<String> arrData) {
            this.arrData = arrData;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHolder viewHolder;
            View v;
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleview, parent, false);
            viewHolder = new MyViewHolder(v);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            Log.e("test2","postion = " + position);
            holder.txvTest.setText(arrData.get(position));
        }

        @Override
        public int getItemCount() {
            Log.e("test2","size from adapter : " + arrData.size());
            return arrData.size();
        }
    }
}
 
 